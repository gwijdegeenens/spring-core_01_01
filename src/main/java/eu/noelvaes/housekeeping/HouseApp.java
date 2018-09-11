package eu.noelvaes.housekeeping;

import eu.noelvaes.housekeeping.services.*;

public class HouseApp {
   public static void main(String[] args) {
      CleaningTool broom = new Broom();
      CleaningTool vacuum = new VacuumCleaner();
      CleaningTool sponge = new Sponge();
      
      CleaningServiceImpl jill = new CleaningServiceImpl();
      jill.setCleaningTool(broom);
      CleaningServiceImpl jane = new CleaningServiceImpl();
      jane.setCleaningTool(vacuum);
      CleaningServiceImpl richard = new CleaningServiceImpl();
      richard.setCleaningTool(sponge);
      
      jill.clean();
      jane.clean();
      richard.clean();    
   }
}
