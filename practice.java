//Section 1 : Pattern Problems 
//1

class Demo{
public static void main(String[]args){
for (int i=1;i<=4;i++){
for(int j=1;j<=4;j++){
System.out.print("*");
}
System.out.println();
}
System.out.println();

//2

for(int i=1;i<=5;i++){
for(int j=1;j<=5;j++){
if(i==1||j==1||i==5||j==5){
System.out.print("*");
}else{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println();

//3

for(int i=1;i<=5;i++){
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
System.out.println();

//4

for(int i=4;i>=1;i--){
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
System.out.println();

//5

for(int i=1;i<=4;i++){
for(int j=1;j<=i;j++){
System.out.print(j);
}
System.out.println();
}
System.out.println();


//6

for(int i=1;i<=4;i++){
for(int j=1;j<=i;j++){
System.out.print(i);
}
System.out.println();
}
System.out.println();

//7

for(char i='A';i<='D';i++){
for(char j='A';j<=i;j++){
System.out.print(j+" ");
}
System.out.println();
}
System.out.println();

//8

for(int i=1;i<=4;i++){
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
System.out.println();

//9

for(int i=4;i>=1;i--){
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
System.out.println();

//10
int sum;
for(int i=1;i<=4;i++){
for(int j=1;j<=i;j++){
sum=i+j;
if(sum%2==1){
System.out.print("0");
}else{
System.out.print("1");
}
}
System.out.println();
}
System.out.println();


//Section 2 : Single For Loop Questions
//11

for(int i=1;i<=5;i++){
System.out.print(i);
}
System.out.println();
System.out.println();

//12

for(int i=5;i>=1;i--){
System.out.print(i);
}
System.out.println();
System.out.println();

//13

for(int i=1;i<=5;i++){
System.out.print(2*i+" ");
}
System.out.println();
System.out.println();

//14

int add=0;
for(int i=1;i<=5;i++){
add=add+i;
}
System.out.print(add);
System.out.println();
System.out.println();

//15

for(int i=1;i<=3;i++){
System.out.println(3*i);
}
System.out.println();
System.out.println();

//16

int fact=1;
for(int i=5;i>=1;i--){
fact=fact*i;
}
System.out.print(fact);
System.out.println();
System.out.println();

//17

for(int i=1;i<=4;i++){
System.out.print(i*i+" ");
}
System.out.println();
System.out.println();

//18

for(int i=1;i<=3;i++){
System.out.print(i*i*i+" ");
}
System.out.println();
System.out.println();

//19
int n=7;
int count=0;
for(int i=1;i<=n;i++){
count++;
}
System.out.print(count);
System.out.println();
System.out.println();

//20

int num=20;
for(int i=1;i<=20;i++){
if(i%5==0){
System.out.print(i+" ");
}
}
System.out.println();
}
}


//Section 3 : digit extraction problems
//21

class Lite{
public static void main(String[]args){

int number= 1234;
int s;
for(int i=1;i<=4;i++){
s=number%10;
System.out.println(s);
number=number/10;
}
System.out.println();

//22

int N=98765;
int f;
f=N%10;
System.out.print(f);
System.out.println();
System.out.println();

//23

int Num=123;
int sum=0;;
for(int i=1;i<=3;i++){
sum=sum+i;
}
System.out.print(sum);
System.out.println();
System.out.println();

//24

int Number=456;
int O;
int d;
for(int i=1;i<=3;i++){
O=Number%10;
System.out.print(O);
Number=Number/10;
}
System.out.println();
System.out.println();

//25

int w=121;
int temporary=w;
int rev=0;
while(temporary>0){
rev=rev*10+temporary%10;
temporary=temporary/10;
}
if(w==rev)
System.out.println("palindrome");
else
System.out.println("not palindrome");
System.out.println();



//26

int b=234;
int c;
int mul=1;;
for(int i=1;i<=3;i++){
c=b%10;
mul=mul*c;
b=b/10;
}
System.out.println(mul);
System.out.println();
System.out.println();

//27

int q=5893;
int t=q%10;
int large=t;
while(q>0){
if(t>large)
large=t;
q=q/10;
}
System.out.println("largest: "+large);
System.out.println();


//28

int g=9421;
int x=g%10;
int small=x;
while(g>0){
if(x>small)
small=x;
g=g/10;
}
System.out.println("smallest: "+small);
System.out.println();


//29

int h=12345;
int even=0;
int odd=0;
int k;
for(int i=1;i<=5;i++){
k=h%10;
if(k%2==0){
even++;
}else{
odd++;
}
h=h/10;
}
System.out.println("Even:"+even);
System.out.println("Odd:"+odd);
System.out.println();


//30

int no=18;
int m;
int temp=no;
int addn=0;
for(int i=1;i<=2;i++){
m=temp%10;
addn=addn+m;
temp=temp/10;
}
if(no%addn==0){
System.out.print(no+" "+"is a Harshad Number");
}else{
}
System.out.println();
System.out.println();

//31

int input= 5789;
int z=input%10;
System.out.print(z);
System.out.println();
System.out.println();


//32
int given= 5789;
while(given>=10){
given=given/10;
}
System.out.print(given);
System.out.println();

//33

int digit=5789;
int first=digit;
int last=digit%10;
for(int i=0;first>=10;i++){
first=first/10;
}
System.out.println("First no :"+first);
System.out.println("Last no :"+last);
System.out.println();

//34

int data=12345;
int tempp=data;
int count=0;
for(;tempp>0;tempp=tempp/10){
count++;
}
int middle=count/2;
tempp=data;
for(int i=0; i<middle;i++){
tempp=tempp/10;
}
System.out.println(tempp%10);
System.out.println();


//35

int v=123456;
int tempo=v;
int cout=0;
for(;tempo>0;tempo=tempo/10){
cout++;
}
int midd=cout/2;
tempo=v;
for(int i=0; i<midd-1;i++){
tempo=tempo/10;
}
System.out.println(tempo%100);
System.out.println();
}
}
