package newpackage1;
class Bond
{
 public void display()
 {
  System.out.println("Bond");
 }
}
class ConvertibleBond extends Bond
{

 public void display()
 {
  System.out.println("ConvertibleBond");
 }
}

class Sample2
{
 public static void main(String args[])
 {
  Bond[] b = new Bond[ 6 ];
 
  b[ 0 ] = new Bond();
  b[ 1 ] = new ConvertibleBond();
  b[ 2 ] = new Bond();
  b[ 3 ] = new ConvertibleBond();
  b[ 4 ] = new Bond();
  b[ 5 ] = new ConvertibleBond();
 
  for ( Bond bi : b )
  {
   bi.display();
  }  
 }
}