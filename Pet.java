class Pet extends Master
{
  String nameMaster;
  
 String pet(int id){if(id==0) return "Cat"; else return "Dog";}
  
 int eat(int food, int drink, int time, int id){ if(time>=100) return 0; 
   else {if(id==0)    return   3*food+3*drink+time; 
     else return 30*food+30*drink+time/2; }}
  
}
