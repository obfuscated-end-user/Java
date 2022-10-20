while (min < linkedList.get(size - 1)) {
            if (linkedList.get(count) < linkedList.get(count + 1)) {
                min = linkedList.get(count);
            } else {
                min = linkedList.get(size - 1);
            }
            System.out.println(min);
            ++count;
        }