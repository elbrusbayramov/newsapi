Newsapi application

This application demonstrate the usage HTTP APIs provided by https://newsapi.org/.

In order to use this api you should get API key, it is clearly explained on https://newsapi.org/.

This application was developed only for learning purposes.

You can clone and use as example the application codes . Below  you can find used android development bricks:

- Customized adapter
- Loader
- Utility class methods for parsing JSON

Url example:
https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=ba9aa3f9e5cf472b8d9c8eae8ccf6d98

JSON response example :

{
"status": "ok",
"totalResults": 20,
-"articles": [
-{
-"source": {
"id": null,
"name": "Reviewjournal.com"
},
"author": "Richard N. Velotta",
"title": "Women on Wynn Resorts board host panel on diversity, equality",
"description": "Wynn Resorts Ltd.’s recent addition of three women to its board of directors is only the beginning of the company’s cultural diversity movement.",
"url": "https://www.reviewjournal.com/business/casinos-gaming/women-on-wynn-resorts-board-host-panel-on-diversity-equality/",
"urlToImage": "https://www.reviewjournal.com/wp-content/uploads/2018/05/10553679_web1_women-s-leadership-may15-18__001.jpg",
"publishedAt": "2018-05-15T06:11:53Z"
},
-{
-"source": {
"id": "the-washington-post",
"name": "The Washington Post"
},
"author": "https://www.facebook.com/simon.denyer?fref=ts",
"title": "US retailer Gap apologizes to China over map on T-shirt that omits Taiwan, South China Sea",
"description": "Gap's apology is the latest in a series by global companies seeking to appease an increasingly assertive China.",
"url": "https://www.washingtonpost.com/news/worldviews/wp/2018/05/15/u-s-retailer-gap-apologizes-to-china-over-map-on-t-shirt-that-omits-taiwan-south-china-sea/",
"urlToImage": "https://www.washingtonpost.com/resizer/aZuUvqkoF2JBkBatGOAN5pmoaKA=/1484x0/arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/NF42MIOJHU6RVLKBWAVJCRIIAY.jpg",
"publishedAt": "2018-05-15T05:41:07Z"
},
-{
-"source": {
"id": null,
"name": "Chicagotribune.com"
},
"author": "Tom Krisher",
"title": "Parts shortage that hit Ford spreads to more companies",
"description": "Ford was forced to temporarily halt production of its popular F-150 pickup truck Wednesday after a fire at a supplier last week caused a parts shortage.",
"url": "http://www.chicagotribune.com/business/ct-ford-suspends-f-150-production-20180510-story.html",
"urlToImage": "http://www.trbimg.com/img-5af489c5/turbine/ct-ford-suspends-f-150-production-20180510",
"publishedAt": "2018-05-10T18:04:00Z"
}
]
}

newsapi/11.jpg
