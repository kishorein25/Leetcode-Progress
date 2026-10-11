            for (int i = 0; i < n; i++) {

                List<Integer> inner = new ArrayList<>(outer.get(i));

                inner.add(num);

                outer.add(inner);

            }
        }

        return outer;
    }
}
