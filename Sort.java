

public class Sort{
public static void main(String arhs[])	{

	String aph="AzCbK";
	aph="xRpSLbFo";

	int sm[]=new int[26];
	int lar[]=new int [26];

	int s=0,l=0;

	for(int i=0;i<aph.length();i++)	{

		char b=aph.charAt(i);
		if(b>=97)
			sm[b-97]++;
		else
			lar[b-65]++;
	}
String req="";

while(s<26 && l<26)
{
	if(sm[s]!=0 && sm[s]
}
for(int as=0;as<sm.length;as++){
	if(sm[as]!=0){
	//System.out.println((char)(as+97));
	req+=(char)(as+97);
}
}
for(int as=0;as<lar.length;as++){
	if(lar[as]!=0){
	//System.out.println((char)(as+97));
	req+=(char)(as+65);

}}
System.out.println(req );

}
}