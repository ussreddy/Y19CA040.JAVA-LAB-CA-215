import java.io.bufferdreader;
import java.io.filereader;
import java.io.ioexecption;
public class lab19
{
public stataic void main(string args[])
{
bufferdreader reader=null;
int charcount=0;
int wordcount=0;
int linecount=0;
try
{
reader= new bufferedreader(new filereader ("sample text"));
string currentline=reader readline();
while(currentline!=null)
{
linecount++;
string [] words=currentline.split('");
wordcount=wordcount+word.length;
for(string word:words)
{
charcount=charcount+word.length();
}
currentline=reader.readline();
}
system.out.println("number of class in a file:"+charcount);
system.out.println("number of words in a file:"+wordcount);
system.out.println("number of lines in a file:"+linecount);
}
catch(ioexcetion());
{
e.printstacktrace();
}
try
{
reader.close();
}
catch(io exception());
{
e.printstacktrace();
}
}
}
}
