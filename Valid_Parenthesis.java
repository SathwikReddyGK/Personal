class Parenthesis {
    public boolean isValid(String s) {
        /*public class parentheses{
            public struct{
                parentheses next;
                char value;
            }

            public add_node(char v){

            }*/
        LinkedList<String> parentheses = new LinkedList<String>();
        for(int i = 0; i<s.length(); i++){
            //String last = " ";
            switch(s.charAt(i)){
                case ')':
                //last = parentheses.getLast();
                if(parentheses.size() == 0) return false;
                else if(parentheses.getLast() == "("){
                    parentheses.removeLast();
                    break;
                }
                else return false; 
                case '}': 
                //last = parentheses.getLast();
                if(parentheses.size() == 0) return false;
                else if(parentheses.getLast() == "{"){
                    parentheses.removeLast();
                    break;
                }
                else return false;          
                case ']': 
                //last = parentheses.getLast();
                if(parentheses.size() == 0) return false;
                else if(parentheses.getLast() == "["){
                     parentheses.removeLast();
                     break;
                 }
                else return false;
                default:
                break;
            }
            
            Character temp = s.charAt(i);
            parentheses.addLast(temp.toString());
            
            /*if(s.charAt(i) == ")" || s.charAt(i) == "}"
            || s.charAt(i) == "]"){
                parenthese.getLast();
            }*/
        
        }
        if(parentheses.size() == 0) return true;
        else return false;
        }
    }
