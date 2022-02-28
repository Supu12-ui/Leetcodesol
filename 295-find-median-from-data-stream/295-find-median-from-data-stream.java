class MedianFinder {
PriorityQueue<Integer> max=new PriorityQueue<>(Comparator.reverseOrder());
    PriorityQueue<Integer> min=new PriorityQueue<>(); 
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(max.size()==0)
        {
            max.add(num);
        }
        else if(max.peek()>=num)
        {
            max.add(num);
            if((max.size()+min.size())%2==0)
            {
               int val=max.remove();
                min.add(val);
            }
        }
        else if(max.peek()<num)
        {
            min.add(num);
            if(max.size()<min.size())
            {
                int val1=min.remove();
                max.add(val1);
            }
            
        }
        
    }
    
    public double findMedian() {
        if(max.size()==1 && min.size()==0)
        {
            return max.peek();
        }
        if((max.size()+min.size())%2==0)
        {
            int sum1=max.peek();
            int sum2=min.peek();
            System.out.println(sum1+" "+sum2);
            double val=sum1+sum2;
            return val/2;
        }
        else 
        {
            return max.peek();
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */