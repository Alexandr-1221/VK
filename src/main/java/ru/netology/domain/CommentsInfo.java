package ru.netology.domain;

public class CommentsInfo {
        private int count;
        private boolean canPost;
        private int groupsCanPost;
        private boolean CanClose;
        private boolean canOpen;

        public int getCount() {
                return count;
        }

        public void setCount(int count) {
                this.count = count;
        }

        public boolean isCanPost() {
                return canPost;
        }

        public void setCanPost(boolean canPost) {
                this.canPost = canPost;
        }

        public int getGroupsCanPost() {
                return groupsCanPost;
        }

        public void setGroupsCanPost(int groupsCanPost) {
                this.groupsCanPost = groupsCanPost;
        }

        public boolean isCanClose() {
                return CanClose;
        }

        public void setCanClose(boolean canClose) {
                CanClose = canClose;
        }

        public boolean isCanOpen() {
                return canOpen;
        }

        public void setCanOpen(boolean canOpen) {
                this.canOpen = canOpen;
        }
}
