
jshell> final int vanillaPrice=49;
vanillaPrice ==> 49

jshell> final int chocolatePrice=42;
chocolatePrice ==> 42

jshell> final int strawberryPrice=80;
strawberryPrice ==> 80

jshell> final int conePrice=100;
conePrice ==> 100

jshell> void processOrder(String flavor,int scoops){
   ...>     if ("v".equals(flavor)){
   ...>         double totalCost=conePrice+vanillaPrice*scoops;
   ...>         System.out.printf("That will be %.2f please.",totalCost);}
   ...>     else if ("c".equals(flavor)){
   ...>         double totalCost=conePrice+chocolatePrice*scoops;
   ...>         System.out.printf("That will be %.2f please.",totalCost);}
   ...>     else if("s".equals(flavor)){
   ...>         double totalCost=conePrice+strawberryPrice*scoops;
   ...>         System.out.printf("That will be%.2f please.",totalCost);}
   ...>     else{
   ...>         System.out.println("We don't have that flavor.");
   ...>     }
   ...> }
|  已创建 方法 processOrder(String,int)