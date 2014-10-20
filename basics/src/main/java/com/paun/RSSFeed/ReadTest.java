package com.paun.RSSFeed;

/**
 * Created by cpaun on 16.10.14.
 */
public class ReadTest {

    public static void main ( String[] args) {
        RSSFeedParser parser = new RSSFeedParser("http://www.vogella.com/article.rss");
        Feed feed = parser.readFeed();

        System.out.println(feed);
        for (FeedMessage message : feed.getMessages()) {
            System.out.println(message);
        }
    }
}
