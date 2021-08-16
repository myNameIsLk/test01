import com.bjpowernode.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Test {
    @org.junit.Test
    public void Test01(){
        String config = "conf/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ac.getBean("studentServiceImpl");
        List<Map<String,Object>> list =service.findStudents();
        //遍历整个List集合（集合中的元素是map集合）
        for (Map<String,Object> map:list
             ) {
            //获取每一个map集合的key部分（set集合）
            Set<String> set = map.keySet();
            //遍历key，获取value
            for (String key:set){
                System.out.println(key+":"+map.get(key));
            }

        }
    }
}
