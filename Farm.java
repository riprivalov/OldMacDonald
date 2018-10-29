class Farm  {     
   private Animal[] aBunchOfAnimals;    
   public Farm()     {       
      aBunchOfAnimals = new Animal[3];
      aBunchOfAnimals[0] = new Cow("Cow","moo");           
      aBunchOfAnimals[1] = new Chick("Chick","cheep");       
      aBunchOfAnimals[2] = new Pig("Pig","oink");    
   }         
   public void animalSounds()    {       
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)       {          
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
     }    
   } 
} 	