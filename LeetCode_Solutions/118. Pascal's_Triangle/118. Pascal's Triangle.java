  	public List<List<Integer>> generate(int numRows) {
        //create ArrayList object
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
	    ArrayList<Integer> row = new ArrayList<Integer>();
	    for(int i=0;i<numRows;i++)
	    {
            //add(index, object)
		    row.add(0, 1);
            //arraylist's length is   size()
		for(int j=1;j<row.size()-1;j++)
            
			row.set(j, row.get(j)+row.get(j+1));
            
		    allrows.add(new ArrayList<Integer>(row));
	    }
        
	    return allrows;
    }
