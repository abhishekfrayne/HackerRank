	// Add your code here
    Difference(int[] arrays){
        elements = arrays;
    }

    public void computeDifference(){
        boolean swapped = true;
        int j=0;
        int temp;
        while(swapped){
            swapped = false;
            j++;
            for(int i=0; i < elements.length -j; i++){
                if(elements[i] > elements[i+1]){
                    temp = elements[i];
                    elements[i] = elements[i+1];
                    elements[i+1] = temp;
                    swapped = true;
                }
            }
        }
        
        maximumDifference = elements[elements.length-1] - elements[0];
    }
