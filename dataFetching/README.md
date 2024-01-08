#### topNFTCollectionsByTradingVolume.js

Obtaining the batch of NFT data with the highest total transaction volume

Results

* Trading volume ranking

* Collection name

* Trading volume (in USD)

* Floor price

  

#### searchCollectionByName.js

Getting the corresponding collection data through the name of the NFT collection.

#### marketPlaceCollectionData.js

Obtaining the NFT collection data required by the marketplace page

Results

* Project name
* The floor ask of the collection, the token id corresponding to the floor ask
* 1 day, 7 day, 30 day trading volume of collection
* Changes in trading volume on 1 day, 7 days, and 30 days
* 1 day，7day，30 day floor sale
* 1 day，7day，30 day floor Sale Change

#### searchCollectionsByGallery.js

Get all Collection data by different galleries

Results

* Collection ID
* Collection name
* Slug
* Contract address
* Image URI
* All time volume
* Floor price

#### detailedCollectionDataForProjectPage.js

Getting the collection details of the project page

Results

* Collection id (from marketplace page)

* Listed: The number of tokens on sale in this collection

* items：The number of tokens

* created by：Author

* royalties

* final mint：The price at which the last token was sold in the primary market (requires multiple API calls, but after only one call, no need to obtain it repeatedly)

* gallery：Listed primary market platforms, such as art blocks, fxhash

* address：Contract address of collection

#### bulkHistoricalTransfers.js

Getting all historical transaction records of a certain token

#### Historical token transfers

Obtaining detailed information about a certain transaction of token based on txhash

