package department;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortSubdivision {

    public static List<Subdivision> increaseSort(List<Subdivision> subdivisions) {
        Collections.sort(subdivisions, new IncreaseCompare());
        return subdivisions;
    }

    public static List<Subdivision> decreaseSort(List<Subdivision> subdivisions) {
        Collections.sort(subdivisions, new DecreaseCompare());
        return subdivisions;
    }

    public static List<Subdivision> getAllSubdivision(List<Subdivision> subdivisionList) {
        Subdivision[] arraySubdevisions = new Subdivision[subdivisionList.size()];
            for (Subdivision subdivision : subdivisionList.toArray(arraySubdevisions)) {
                String[] items = subdivision.getName().split("\\\\");
                String code = items[0];
                for (int i = 1; i < items.length; i++) {
                    Subdivision tempSubdevision = new Subdivision(code);
                    if (!subdivisionList.contains(tempSubdevision)) {
                        subdivisionList.add(tempSubdevision);
                    }
                    code += "\\" + items[i];
                }
            }
        return subdivisionList;
    }



    static class IncreaseCompare implements Comparator<Subdivision> {

        @Override
        public int compare(Subdivision o1, Subdivision o2) {
            int result = 0;
            String[] codes1 = o1.getName().split("\\\\");
            String[] codes2 = o2.getName().split("\\\\");
            int length = codes1.length >= codes2.length ? codes2.length : codes1.length;
            for (int i = 0; i < length; i++) {
                Integer one = Integer.parseInt(codes1[i].substring(i + 1));
                Integer two = Integer.parseInt(codes2[i].substring(i + 1));
                result = one.compareTo(two);
                if (result != 0) {
                    break;
                }
            }
            if ((result == 0 && codes1.length > codes2.length) || (result == 0 && codes1.length < codes2.length)) {
                return codes1.length > codes2.length ? 1 : -1;
            }
            return result;
        }

    }

    static class DecreaseCompare implements Comparator<Subdivision> {

        @Override
        public int compare(Subdivision o1, Subdivision o2) {
            int result = 0;
            String[] codes1 = o1.getName().split("\\\\");
            String[] codes2 = o2.getName().split("\\\\");
            int length = codes1.length >= codes2.length ? codes2.length : codes1.length;
            for (int i = 0; i < length; i++) {
                Integer one = Integer.parseInt(codes1[i].substring(i + 1));
                Integer two = Integer.parseInt(codes2[i].substring(i + 1));
                result = one.compareTo(two) * (-1);
                if (result != 0) {
                    break;
                }
            }
            if ((result == 0 && codes1.length > codes2.length) || (result == 0 && codes1.length < codes2.length)) {
                return codes1.length > codes2.length ? 1 : -1;
            }
            return result;
        }

    }
}
