public class Main2 {
    public static void main(String[] args) {
      
        Runner runner = new Runner();
        runner.name = "Usain Bolt";
        runner.distance = 8;
        runner.train();
        
        runner.run();
     
      
        Swimmer swimmer = new Swimmer();
        swimmer.name = "Kakoyto swimmer";
        swimmer.distance = 1;
        swimmer.train();
        swimmer.swim();
       
    }
}
