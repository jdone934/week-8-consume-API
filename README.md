# week-8-conusme-API

I've decided to consume an API called Scryfall (See [https://scryfall.com/docs/api](https://scryfall.com/docs/api) for documentation).
This is an API that provides information about a trading card game called Magic The Gathering.

I'm using a function that searches for cards based on the name of the card. The function returns a list of potential card matches, so I've included logic in my test to pull the first card from that list and test for that card's name.

Worth noting, due to the complexity of Magic the Gathering and the different mediums you can play it on (in paper and a few different online clients), there are many different fields that could be returned with a card. 
I've built my POJOs using a card that should include most of these fields, but I would have to use the documentation on [this page](scryfall.com/docs/api/cards) to ensure I'm accounting for every single possible field.
I could also use the Jackson annotation @JsonIgnoreProperties to ignore properties that aren't defined yet, but this would be dependent on the application I'm using this API for.  