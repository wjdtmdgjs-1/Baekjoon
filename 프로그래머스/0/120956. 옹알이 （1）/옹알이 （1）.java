
class Solution {
    public int solution(String[] babbling) {
        int count =0;
        
        for(int i=0; i<babbling.length; i++){           
            int set=0;
            if(babbling[i].contains("aya")){
                babbling[i]=babbling[i].replace("aya"," ");
                set++;
            }
            if(babbling[i].contains("ye")){
                babbling[i]=babbling[i].replace("ye"," ");
                set++;
            }
            if(babbling[i].contains("woo")){
                babbling[i]=babbling[i].replace("woo"," ");
                set++;
            }
            if(babbling[i].contains("ma")){
                babbling[i]=babbling[i].replace("ma"," ");
                set++;
            }
            System.out.println(set);
            if(set==1 && babbling[i].equals(" ")){
                count++;
            }
            if(set==2 && babbling[i].equals("  ")){
                count++;
            }
            if(set==3 && babbling[i].equals("   ")){
                count++;
            }
            if(set==4 && babbling[i].equals("    ")){
                count++;
            }
        }
        return count;
    }
}