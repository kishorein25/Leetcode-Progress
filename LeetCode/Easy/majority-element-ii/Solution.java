        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int val = entry.getValue();

            if(val > n/3){

                list.add(entry.getKey());
            }
        }

        return list;
    }
}
