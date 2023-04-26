package accessControl.carFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex
{
  String married = "married";
  String single ="single";
  Pattern re = Pattern.compile("\\bmarried\\b",Pattern.CASE_INSENSITIVE);
  Pattern re2 = Pattern.compile("\\bsingle\\b",Pattern.CASE_INSENSITIVE);
  Matcher m  = re.matcher(married);
  Matcher n  = re.matcher(single);

  boolean test1= m.matches();
  boolean test2= n.matches();


}
