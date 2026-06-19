package easy;

class VersionControl {
    private static final int BAD_VERSION = 4;

    protected boolean isBadVersion(int version) {
        return version >= BAD_VERSION;
    }
}

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
