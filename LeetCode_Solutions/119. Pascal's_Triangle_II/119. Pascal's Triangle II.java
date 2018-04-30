	public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i <= rowIndex; i++){
                list.add(0,1);
            for(int j = 1; j < list.size() - 1; j++){
                    list.set(j, list.get(j) + list.get(j+1));
            }
        }
        return list;
    }

    //Note: similar to 118,  118's 弱化版