 class Program{
  
  public static void main(String[] arg){
        
   Master person = new Master();
   person.name = "Jon"; 
    
   Cat bursik = new Cat();  
   
   System.out.println("������ Pedigree �� Whiskas? "+bursik.eat(12, 43, 76,0)+" Gr.");
   
   System.out.println("             ʳ� �� ���?"+bursik.pet(0));
   System.out.println("                       ��� ��������? ms'"+person.name);
   System.out.println("                                   ������ ���� �� ����?"+bursik.catchedMouse(1));
   
   
   
   Master person2 = new Master();
   person2.name = "Jane";
      
   Dog browko = new Dog();
   System.out.println("������ Pedigree �� Whiskas? "+browko.eat(12, 43, 101,1)+" Gr.");
   System.out.println("             ʳ� �� ���?"+browko.pet(1));
   System.out.println("                       ��� ��������? ms'"+person2.name);
   System.out.println("                                   ������ ���� �� ����?"+browko.preserve(0));
   
   Master person3 = new Master();
   System.out.println("�heking_isEmty_person3.name = "+person3.isEmpty_name());
   if (person3.isEmpty_name() == true) person3.name ="������";
   System.out.println("Out_person3.name = "+person3.name);
   System.out.println("Once_isEmty_cheking_person3.name = "+person3.isEmpty_name());
  }
}