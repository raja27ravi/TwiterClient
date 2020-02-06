package com.concordia.ece.se;

//import java.awt.List;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.social.twitter.api.Twitter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import javax.ws.rs.core.MediaType;
import org.springframework.http.MediaType;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;;

@RestController
@RequestMapping(TwitterController.TWITTER_BASE_URI)
public class TwitterController {

public static final String TWITTER_BASE_URI="gsr/v1/tweets";

@Autowired
private Twitter twitter;
	
@RequestMapping(value = "{hashtag",produces=MediaType.APPLICATION_JSON_VALUE)
public List<Tweet> getTweets(@PathVariable final String hashtag)
{
	
return twitter.searchOperations().search(hashtag,20).getTweets();
}

}
 