public class Main {
    public static void main(String[] args) {

        //Task#1
int salary = 15000;
int total = 0;
int month = 0;
while (total < 2459000) {
    total = total + total / 100;
    total = total + salary;
    month++;
    System.out.println(" Месяц " + month + " сумма накоплений равна " + total + " рублей ");}

        System.out.println( );

        //Task#2
int start = 1;
while (start <= 10){
    System.out.print(start + " " );
    start = start + 1;
}
        System.out.println( );
int start1 = 10;
for (start1 = 10; start1 > 0; start1 = start1 - 1){
    System.out.print(start1 + " ");}
        System.out.println( );


        //Task#3
int population = 12000000;
int birth1000 = 17;
int death1000 = 8;
int year;
for (year = 0; year <= 10; year++) {
population += population/1000 * birth1000 - population/1000 * death1000;
    System.out.println(" Год " + year + " численность населения составляет " + population);}
        System.out.println(population);

        System.out.println();

        //Task#4
int amount = 15000;
int total1 = 0;
int month1 = 0;
while ( total1 < 12000000 ){
    total1 = (int) (total1 + total1 * 0.07);
    total1 = total1 + amount;
    month1++;
    System.out.println( " Месяц " + month1 + " сумма накоплений равна " + total1 );
}
        System.out.println( );
        //Task#5
int amount1 = 15000;
int total2 = 0;
int month2 = 0;
while ( total2 < 12000000){
    total2 = (int) (total2 + total2 * 0.07);
total2 = total2 + amount1;
month2++;
if (month2 % 6 == 0)
    System.out.println( " Месяц " + month2 + " сумма накоплений равна " + total2 );
}
        System.out.println( );

        //Task#6
 int money = 15000;
 int total3 = 0;
 for (int month3 = 1; month3 <= 108; month3++){
 total3 = (int) (total3 + total3 * 0.07);
 total3 = total3 + money;
 if (month3 % 6 == 0)
     System.out.println(" Месяц " + month3 + " сумма накоплений равна " + total3);
 }
        System.out.println( );

        //Task#7
int friday = 1;
do {
    System.out.println(" Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет " );
    friday = friday + 7;
}
while (friday < 30);

        System.out.println( );

        //Task#8
        int present = 2024;
        int past = present - 200;
        int future = present + 100;
        for (int comet = past; comet<future; comet++) {
            if (comet % 79 == 0)
                System.out.println(comet);
        }

}}
