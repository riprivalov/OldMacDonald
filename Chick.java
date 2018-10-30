    class Chick implements Animal {     
     private String myType;     
     private String mySound;      
     public Chick(String type, String sound, String sound2)     {   
        int random;      
        random = (int)(Math.random()*2);
         myType = type;
         if (random == 0){
                mySound = sound;
             } else if (random == 1)
             {
                mySound = sound2;
             }
              
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}