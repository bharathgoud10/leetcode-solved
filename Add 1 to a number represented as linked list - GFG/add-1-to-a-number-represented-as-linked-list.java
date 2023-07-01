//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    static void getString(StringBuilder sb){
         int n=sb.length();
         for(int i=n-1;i>=0;){
            char c=sb.charAt(i);
            if(c!='9'){
                sb.replace(i,i+1,""+((c-'0')+1));
                break;
            }
            else{
            sb.replace(i,i+1,"0");
            i--;
            }
        }
        if(sb.charAt(0)=='0')
        sb.insert(0,"1");
    }
    public static Node addOne(Node head) 
    { 
        //code here.
        StringBuilder sb=new StringBuilder("");
        Node curr=head;
        while(curr!=null){
            sb.append(""+curr.data);
            curr=curr.next;
        }
           getString(sb);
           int n=sb.length();
         head=new Node(sb.charAt(0)-'0');
         curr=head;
         for(int i=1;i<n;i++){
             char c=sb.charAt(i);
             curr.next=new Node(c-'0');
             curr=curr.next;
         }
        return head;
    }
}
