/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.util.Scanner;

/**
 *
 * @author EMA
 */
public class Encry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//          char[] Litter=new char[52];  
//          int index=0;
//        for(int x=0;x<=60;x++){
//         Litter[index]=(char)('A'+x);
//        if(Litter[index]=='Z')x+=6;
//        if(Litter[index++]=='z')break;
//        }
////        Small Chae only
//         char[] Litter=new char[26];  
//          int index=0;
//        for(int x=0;x<=60;x++){
//         Litter[index]=(char)('a'+x);
////        if(Litter[index]=='Z')x+=6;
//        if(Litter[index++]=='z')break;
//        }
        
        String alpha="abcdefghijklmnopqrstuvwxyz";
        char []Litter=alpha.toCharArray();
//        char[] Litter={'a','x','v','w'};
//        //Small Chae only with space
//         char[] Litter=new char[27];  
//          int index=0;
//          Litter[index++]=' ';
//        for(int x=0;x<=60;x++){
//         Litter[index]=(char)('a'+x);
//        if(Litter[index]=='Z')x+=6;
//        if(Litter[index++]=='z')break;
//        }
        
        
      
//        for(int i=0;i<52;i++)System.out.println(Litter[i]);
       
        //##########################################  CEASER  ##########################################################
        Scanner data=new Scanner(System.in);
//        int KEY=data.nextInt();
//        String MSG=data.next();
//        String ENC="";
//        for(int i=0;i<MSG.length();i++){
//            char ch=MSG.charAt(i);
//            for(int t=0;t<Litter.length;t++){
//                if(ch==Litter[t]){
//                        ENC+=Litter[(t+KEY)%Litter.length];
//                }
//            }
//        }
//        System.out.println(ENC);
//        
        //********* Decryption ********
        
//        int KEY2=data.nextInt();
//        String MSG2=data.next();
//        String DEC="";
//        int tuse = 0;
//        for(int i=0;i<MSG2.length();i++){
//            char ch=MSG2.charAt(i);
//            for(int t=0;t<Litter.length;t++){
//                  if(ch==Litter[t]){
//                      tuse=t;
//                    for(;;)
//                        if(tuse-KEY2 < 0 ) tuse=tuse-KEY2+Litter.length+2; 
//                        else break;
//                                                               
//                    DEC+=Litter[(tuse-KEY2)];
//                }
//            }
//        }
//        System.out.println(DEC);
//        
        
        //********* KEY ********
//        System.out.print("Write Plain  : ");
//       String MSG1=data.next();
//        System.out.print("Write Cipher : ");
//       String MSG2=data.next();
//       int Index1=-1;
//       int Index2=-1;
//       int num = -1;
//        System.out.print("Key : ");
//       for(int ii=0;ii<MSG1.length();ii++){
//       for(int i=0;i<Litter.length;i++){
//           if(MSG1.charAt(0)==Litter[i])Index1=i;
//           if(MSG2.charAt(0)==Litter[i])Index2=i;
//       }
//       num=(Index2-Index1);System.out.print(num+" ");}
//       if(Index1==-1||Index2==-1){System.out.println("MSG Wrong");System.exit(-1);}
//       for(;;){
//           if(num<0)num+=Litter.length;
//           else break;
//       }
//        System.out.println("\nKey is : "+num);
       
        System.out.print("Enter Cipher : ");
        String cipher=data.next();
        String[] pain=new String[Litter.length];
        for(int i=0;i<Litter.length;i++)pain[i]="";
        
        for(int u=0;u<Litter.length;u++)
        for(int i=0;i<cipher.length();i++)
        {
            for(int o=0;o<Litter.length;o++){
                if(cipher.charAt(i)==Litter[o]){
                    int y;
                    y=u-o;
                    if(y<o)y+=Litter.length;
                    if(y>(Litter.length-1))y%=(Litter.length-1);
                    pain[u]+=Litter[y];
                }
            }
        }
//        System.out.println(pain);
        for(int i=0;i<Litter.length;i++)System.out.println(i+" : "+pain[i]);
//       
        //################################# POLY ALPHAPITIC ############################################
//         char[] Litter=new char[53]; 
//           Litter[0]=(char)(' ');
//          int index=1;
//        for(int x=0;x<=60;x++){
//         Litter[index]=(char)('A'+x);
//        if(Litter[index]=='Z')x+=6;
//        if(Litter[index++]=='z')break;
//        }
      
//        String KEYWORD=data.nextLine();
//        String MSG=data.nextLine();
//        String ENC="";
//        for(int i=0;i<MSG.length();i++){
//            char KEY=KEYWORD.charAt(i%KEYWORD.length());
//            char ch=MSG.charAt(i);
//            for(int h=0;h<Litter.length;h++){
//                if(ch==Litter[h]){
//                    for(int v=0;v<Litter.length;v++){
//                        if(KEY==Litter[v]){
//                            ENC+=Litter[(v+h)%Litter.length];
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(ENC);
        
         //********* Decryption ********
//        char[] Litter=new char[53]; 
//           Litter[0]=(char)(' ');
//          int index=1;
//        for(int x=0;x<=60;x++){
//         Litter[index]=(char)('A'+x);
//        if(Litter[index]=='Z')x+=6;
//        if(Litter[index++]=='z')break;
//        }
//      
//        String KEYWORD=data.next();
//        String MSG=data.next();
//        String ENC="";
//        for(int i=0;i<MSG.length();i++){
//            char KEY=KEYWORD.charAt(i);
//            char ch=MSG.charAt(i);
//            for(int h=0;h<Litter.length;h++){
//                if(ch==Litter[h]){
//                    for(int v=0;v<Litter.length;v++){
//                        if(KEY==Litter[v]){
//                            if(h-v<0)    ENC+=Litter[(h-v+Litter.length)];
//                            else ENC+=Litter[(h-v)];
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(ENC);
        
        //*********** KEY *****************
//      //  a=0
//        String MSG1=data.nextLine();
//        String MSG2=data.nextLine();
//        int first=0,second=0;
//        String key="";
//        for(int i=0;i<MSG1.length();i++){
//            for(int n=0;n<Litter.length;n++){
//                if(Litter[n]==MSG2.charAt(i))first=n;
//                if(Litter[n]==MSG1.charAt(i))second=n;
//            }
//            int m=first-second;
//            if(m<0)m+=Litter.length;
////                                                                    System.out.println(m);
//            if(i>0&&key.charAt(0)==Litter[m])break;
//            key+=Litter[m];
//        }
//        System.out.println(key);
        
        
//################################## FULL VIGERERE #########################################
        
//        char[][] L2=new char[52][52];
//        int counter=0;
//        for(int i=0;i<L2.length;i++){
//            for(int x=0;x<L2[i].length;x++){
//                L2[i][x]=Litter[(x+counter)%Litter.length];
//                System.out.print(Litter[(x+counter)%Litter.length]);
//            }
//            counter++;
//            System.out.println("");
//        }
//        String ENC="";
//        String MSG=data.next();
//        String KEY=data.next();
//        for(int i=0;i<MSG.length();i++){
//            char ch=MSG.charAt(i);
//            char key=KEY.charAt((i%KEY.length()));
//        for(int o=0;o<L2.length;o++){
//          for(int n=0;n<L2[o].length;n++){
//              if(L2[0][o]==ch && L2[n][0]==key)ENC+=L2[n][o];
//          }
//        }
//        }
//        System.out.println(ENC);
        
      //********* Decryption ********

//        char[][] L2=new char[52][52];
//        int counter=0;
//        for(int i=0;i<L2.length;i++){
//            for(int x=0;x<L2[i].length;x++){
//                L2[i][x]=Litter[(x+counter)%Litter.length];
//                System.out.print(Litter[(x+counter)%Litter.length]);
//            }
//            counter++;
//            System.out.println("");
//        }
//        String DEC="";
//        String MSG=data.next();
//        String KEY=data.next();
//        for(int i=0;i<MSG.length();i++){
//            char ch=MSG.charAt(i);
//            char key=KEY.charAt((i%KEY.length()));
//        for(int o=0;o<L2.length;o++){
//           for(int n=0;n<L2[o].length;n++){
//               if(key==L2[o][0]&&ch==L2[o][n])DEC+=L2[0][n];
//           }
//        }
//        }
//        System.out.println(DEC);
        
        //****************** KEY *****************
//         char[][] L2=new char[Litter.length][Litter.length];
//        int counter=0;
//        for(int i=0;i<L2.length;i++){
//            for(int x=0;x<L2[i].length;x++){
//                L2[i][x]=Litter[(x+counter)%Litter.length];
//                System.out.print(Litter[(x+counter)%Litter.length]);
//            }
//            counter++;
//            System.out.println("");
//        }
//        String KEY="";
//        String MSG1=data.next();
//        String MSG2=data.next();
//        for(int i=0;i<MSG1.length();i++){
//            char ch=MSG1.charAt(i);
//            char key=MSG2.charAt(i);
//        for(int o=0;o<L2.length;o++){
//          for(int n=0;n<L2[o].length;n++){
//                            //change 0 with o and o with 0
//              if(L2[0][o]==ch && L2[n][o]==key){
//                  if(KEY.length()>0&&KEY.charAt(0)==L2[n][0])break;
//                  KEY+=L2[n][0];
//              }
//          }
//        }
//        }
//        System.out.println(KEY);
        
        
 //############################ TRANSPOSITION METHOD ######################################
        // عايزه تظبيط ب الاراى ليست
        
//        String KEY=data.next();
//        String MSG=data.next();
//        String ENC="";
//        String[] key_words=new String[KEY.length()];
//        
//        if(MSG.length() % KEY.length() !=0){
//            for(int i=0;i<MSG.length() % KEY.length();i++)
//                MSG+=(char)('a'+i);
//        }
//        for(int i=0;i<MSG.length();i++){
//            if(key_words[i%KEY.length()]==null)key_words[i%KEY.length()]="";
//            key_words[i%KEY.length()]+=MSG.charAt(i);
//        }
//        //for print each word in char of key
////        for(int i=0;i<key_words.length;i++)System.out.println(key_words[i]);
//       String s="";
//       char[] xx=new char[KEY.length()];
//       xx=KEY.toCharArray();
//        for(int i=0;i<KEY.length();i++){
//         for(int x=i;x<KEY.length();x++){
//            if(xx[i]>xx[x]){
//                char swap=xx[i];
//                xx[i]=xx[x];
//                xx[x]=swap;
//             }
//        }   
//            }
//        for(int i=0;i<xx.length;i++){
////            0 = null
//            for(int u=0;u<xx.length;u++){
//                if(xx[i]==KEY.charAt(u))ENC+=key_words[u]+" ";
//            }       
//        }  
//            //if(xx[i]==KEY.charAt(i))System.out.println(i);
//         System.out.println(ENC);
//        
      //********* Decryption ********

//          String KEY=data.next();
//        String MSG=data.next();
//        String DEC="";
//        String[] key_words=new String[KEY.length()];
//        
//        int charnumber=MSG.length()/KEY.length();
//        
//        
//        
//        
//        
//        if(MSG.length() % KEY.length() !=0){
//            for(int i=0;i<MSG.length() % KEY.length();i++)
//                MSG+=(char)('a'+i);
//        }
//        
//        int in=-1;
//        for(int i=0;i<KEY.length();i++){
//            key_words[i]=MSG.substring(i*charnumber, i*charnumber+charnumber);
//        }
//        //for print each word in char of key
//        for(int i=0;i<key_words.length;i++)System.out.println(key_words[i]);
//       String s="";
//       char[] xx=new char[KEY.length()];
//       xx=KEY.toCharArray();
//        for(int i=0;i<KEY.length();i++){
//         for(int x=i;x<KEY.length();x++){
//            if(xx[i]>xx[x]){
//                char swap=xx[i];
//                xx[i]=xx[x];
//                xx[x]=swap;
//             }
//        }   
//            }
//        String[] resort_key_words=new String[KEY.length()];
//        
//        for(int i=0;i<xx.length;i++){
////            0 = null
//            for(int u=0;u<xx.length;u++){
//                if(KEY.charAt(i)==xx[u]){
//                    resort_key_words[i]=key_words[u];
//                }
//            }       
//        }  
//        for(int n=0;n<charnumber;n++){
//        for(int i=0;i<KEY.length();i++){
//           DEC+=resort_key_words[i].charAt(n);
//        }
//        }
////            //if(xx[i]==KEY.charAt(i))System.out.println(i);
//         System.out.println(DEC);
//        
          
//        
//      String x="12345";
//        System.out.println(x.substring(0,3));
        
//        a   b  c  d  e  f  g  h  i  j  k  l  m  n  o  p  q   r    s
//        0   1   2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17  18  19       
        //26
        // TODO code application logic here
//        fire now ready
//        snyfbhrgmwlbfs
//        System.out.println("CAESER\t\t\t\t ENC DEC KEY\nPOLY ALPHABETIC SUBISTITUTION    ENC DEC KEY\nFULL VIGERERE \t\t\t ENC DEC KEY\nTRANSPOSITION METHOD \t\t ENC DEC");
    }
    
}
