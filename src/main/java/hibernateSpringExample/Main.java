package hibernateSpringExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" }, true);
        StudentDAO studDao = (StudentDAO) context.getBean("dataDao");
//        Student data1 = new Student("Alex",20l);
        studDao.save(new Student("Alex",20l));
//        Student data2 = new Student("Bob",22l);
        studDao.save(new Student("Bob",22l));
        Student data3 = new Student("Alice", 19l);
        studDao.save(data3);
        System.out.println(studDao.find("A%").size());
    }

}