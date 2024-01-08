//---For project data----------
class ProjectCurrency {
    constructor(contract, name, symbol, decimals) {
        this.contract = contract;
        this.name = name;
        this.symbol = symbol;
        this.decimals = decimals;
    }
}
/*
"amount": {
          "raw": "8950000000000000000",
          "decimal": 8.95,
          "usd": 13881.15351,
          "native": 8.95
        }
*/

class ProjectAmount {
    constructor(raw, decimal, usd, native) {
        this.raw = raw;
        this.decimal = decimal;
        this.usd = usd;
        this.native = native;
    }
}

/*
"floorAskPrice": {
        "currency": {
          "contract": "0x0000000000000000000000000000000000000000",
          "name": "Ether",
          "symbol": "ETH",
          "decimals": 18
        },
        "amount": {
          "raw": "8950000000000000000",
          "decimal": 8.95,
          "usd": 13881.15351,
          "native": 8.95
        }
*/

class ProjectFloorAskPrice {
    constructor(currency, amount) {
        this.currency = currency;
        this.amount = amount;
    }
}

/*
{
      "collectionId": "0x059edd72cd353df5106d2b9cc5ab83a52287ac3a:0:999999",
      "name": "Chromie Squiggle by Snowfro",
      "slug": "chromie-squiggle-by-snowfro",
      "contract": "0x059edd72cd353df5106d2b9cc5ab83a52287ac3a",
      "image": "https://i.seadn.io/gae/0qG8Y78s198F2GZHhURw8_TEfxFlpS2XYnuLV_OW6TJin5AV1G2WOSpcLGnEmv5g2gZ6R6Pxjd4v1DP2p0bxptckM6ZJ3cMIvQmrgDM?w=500&auto=format",
      "allTimeVolume": 74704.44635,
      "floorAskPrice": {
        "currency": {
          "contract": "0x0000000000000000000000000000000000000000",
          "name": "Ether",
          "symbol": "ETH",
          "decimals": 18
        },
        "amount": {
          "raw": "8950000000000000000",
          "decimal": 8.95,
          "usd": 13881.15351,
          "native": 8.95
        }
      },
      "openseaVerificationStatus": "verified"
    },
*/

class ProjectCollection {
    constructor(
        collectionId,
        name,
        slug,
        contract,
        image,
        allTimeVolume,
        floorAskPrice,
        openseaVerificationStatus
    ) {
        this.collectionId = collectionId;
        this.name = name;
        this.slug = slug;
        this.contract = contract;
        this.image = image;
        this.allTimeVolume = allTimeVolume;
        this.floorAskPrice = floorAskPrice;
        this.openseaVerificationStatus = openseaVerificationStatus;
    }
}

//---For marketplace data----------
class MarketRoyalties {
    constructor(recipient, bps) {
        this.recipient = recipient;
        this.bps = bps;
    }
}

class MarketFloorAsk {
    constructor(id, price, maker, validFrom, validUntil, token) {
        this.id = id;
        this.price = price;
        this.maker = maker;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.token = token;
    }
}

class TopBid {
    constructor(id, price, maker, validFrom, validUntil, token) {
        this.id = id;
        this.price = price;
        this.maker = maker;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.token = token;
    }
}

class MarketCollection {
    constructor(
        chainId,
        id,
        slug,
        createdAt,
        updatedAt,
        name,
        image,
        banner,
        discordUrl,
        externalUrl,
        twitterUsername,
        openseaVerificationStatus,
        description,
        tokenCount,
        onSaleCount,
        primaryContract,
        tokenSetId,
        creator,
        royalties,
        floorAsk,
        topBid,
        collectionBidSupported,
        ownerCount,
        contractKind,
        mintedTimeStamp
    ) {
        this.chainId = chainId;
        this.id = id;
        this.slug = slug;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.image = image;
        this.banner = banner;
        this.discordUrl = discordUrl;
        this.externalUrl = externalUrl;
        this.twitterUsername = twitterUsername;
        this.openseaVerificationStatus = openseaVerificationStatus;
        this.description = description;
        this.tokenCount = tokenCount;
        this.onSaleCount = onSaleCount;
        this.primaryContract = primaryContract;
        this.tokenSetId = tokenSetId;
        this.royalties = royalties;
        this.floorAsk = floorAsk;
        this.topBid = topBid;
        this.collectionBidSupported = collectionBidSupported;
        this.ownerCount = ownerCount;
        this.contractKind = contractKind;
        this.mintedTimestamp = mintedTimeStamp;
    }
}
