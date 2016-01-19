//package calculating_volume;
//
//import java.io.IOException;
//
//public class Solution
//{
//
//    public static void main(String[] args) {
//        Do_Not_Terminate.forbidExit();
//        try{
//            Calculate cal=new Calculate();
//            int T=cal.getINTVal();
//            while(T-->0){
//                double volume = 0.0d;
//                int ch=cal.getINTVal();
//                if(ch==1){
//
//                    int a=cal.getINTVal();
//                    volume=Calculate.get_Vol().main(a);
//
//
//                }
//                else if(ch==2){
//
//                    int l=cal.getINTVal();
//                    int b=cal.getINTVal();
//                    int h=cal.getINTVal();
//                    volume=Calculate.get_Vol().main(l,b,h);
//
//                }
//                else if(ch==3){
//
//                    double r=cal.getDoubleVal();
//                    volume=Calculate.get_Vol().main(r);
//
//                }
//                else if(ch==4){
//
//                    double r=cal.getDoubleVal();
//                    double h=cal.getDoubleVal();
//                    volume=Calculate.get_Vol().main(r,h);
//
//                }
//                cal.output.display(volume);
//            }
//
//        }
//        catch (NumberFormatException e) {
//            System.out.print(e);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        catch (Do_Not_Terminate.ExitTrappedException e) {
//            System.out.println("Unsuccessful Termination!!");
//        }
//
//
//    }
//}