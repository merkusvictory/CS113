import java.util.Random;

public class ProjectApp {
    public static void main (String[] args) {
    
    Random gen = new Random();
    int random;

    Project template = new Project("Research Project", 10);
    System.out.println(template);
    
    Project bigData = new Project("Big Data", 0);
    
    int dayCount = 0;
    while(template.getPages() > bigData.getPages()) {
        dayCount += 1;
        random = gen.nextInt(4);
        bigData.addPages(random);
        System.out.println("Day" + dayCount + ": Pages added: " + random);
    }
    
    System.out.println(bigData);
    System.out.println("Number of days to complete: " + dayCount);

    }
}
