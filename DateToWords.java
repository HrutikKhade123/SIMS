package project;
import java.util.*;
import java.text.*;
import javax.swing.JOptionPane;

public class DateToWords{
String string;
String st1[] = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
"Eight", "Nine", };
String st2[] = { "Hundred", "Thousand"};
String st3[] = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
"Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen", };
String st4[] = { "Twenty", "Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};

public String getMonth(int month) {
return new DateFormatSymbols().getMonths()[month-1];
}

public String convert(int number){
int n = 1;
int word;
string = "";
while (number != 0) {
switch (n) {
case 1:
word = number % 100;
pass(word);
if (number > 100 && number % 100 != 0) {
show("and ");
}
number /= 100;
break;

case 2:
word = number % 10;
if (word != 0) {
show(" ");
show(st2[0]);
show(" ");
pass(word);
}
number /= 10;
break;

case 3:
word = number % 100;
if (word != 0) {
show(" ");
show(st2[1]);
show(" ");
pass(word);
}
number /= 100;
break;

case 4:
word = number % 100;
if (word != 0) {
show(" ");
show(st2[2]);
show(" ");
pass(word);
}
number /= 100;
break;

case 5:
word = number % 100;
if (word != 0) {
show(" ");
show(st2[3]);
show(" ");
pass(word);
}
number /= 100;
break;

}
n++;
}
return string;
}

public void pass(int number) {
int word, q;
if (number < 10) {
show(st1[number]);
}
if (number > 9 && number < 20) {
show(st3[number - 10]);
}
if (number > 19) {
word = number % 10;
if (word == 0) {
q = number / 10;
show(st4[q - 2]);
} else {
q = number / 10;
show(st1[word]);
show(" ");
show(st4[q - 2]);
}
}
}
public void show(String s) {
String st;
st = string;
string = s;
string += st;
}

public String setDateInWords(Date d) {
    String Res = null;
    try
    {
DateToWords num = new DateToWords();
Calendar cal = Calendar.getInstance();
//Date d=new Date(myDate);  //MM DD YY  DD MM YY
SimpleDateFormat dmyFormat = new SimpleDateFormat("dd-MM-yyyy");
String dmy = dmyFormat.format(d);
//System.out.println("Today's Date is&&&&&&&&&&&&: "+dmy.toString());

cal.setTime(d);
int day = cal.get(Calendar.DATE);
int month = cal.get(Calendar.MONTH) + 1;
int year = cal.get(Calendar.YEAR);
//System.out.println("Today's Date is: "+d.toString());
Res = new String(num.convert(day)+" "+num.getMonth(month)+" "+num.convert(year));
    }
    catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null, "Fill All Date Of Birth");
        }
        catch(NullPointerException npe1)
        {
            JOptionPane.showMessageDialog(null, "Fill All Date Of Birth");
        }
//System.out.println("Today's Date(in words) is: "+);
return Res;
}
}