class Palindrome {
    //Write your code here
    LinkedList queue;
    LinkedList stack;
    Palindrome(){
        queue = new LinkedList();
        stack = new LinkedList();
    }
    
    public void pushCharacter(char c){
        stack.addFirst(c);
    }
    
    public void enqueueCharacter(char c){
        queue.addFirst(c);
    }
    
    public char popCharacter(){
        return (char) stack.removeLast();
    }
    
    public char dequeueCharacter(){
        return (char) queue.removeFirst();
    }
}