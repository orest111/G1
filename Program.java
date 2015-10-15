 class Program{
  
  public static void main(String[] arg){
        
   Master person = new Master();
   person.name = "Jon"; 
    
   Cat bursik = new Cat();  
   
   System.out.println("Скільки Pedigree чи Whiskas? "+bursik.eat(12, 43, 76,0)+" Gr.");
   
   System.out.println("             Кіт чи пес?"+bursik.pet(0));
   System.out.println("                       Хто господар? ms'"+person.name);
   System.out.println("                                   Ловить миші чи котів?"+bursik.catchedMouse(1));
   
   
   
   Master person2 = new Master();
   person2.name = "Jane";
      
   Dog browko = new Dog();
   System.out.println("Скільки Pedigree чи Whiskas? "+browko.eat(12, 43, 101,1)+" Gr.");
   System.out.println("             Кіт чи пес?"+browko.pet(1));
   System.out.println("                       Хто господар? ms'"+person2.name);
   System.out.println("                                   Ловить миші чи котів?"+browko.preserve(0));
   
   Master person3 = new Master();
   System.out.println("Сheking_isEmty_person3.name = "+person3.isEmpty_name());
   if (person3.isEmpty_name() == true) person3.name ="Коваль";
   System.out.println("Out_person3.name = "+person3.name);
   System.out.println("Once_isEmty_cheking_person3.name = "+person3.isEmpty_name());
  }
}