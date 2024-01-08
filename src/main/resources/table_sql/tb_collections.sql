CREATE TABLE tb_collections
(
    id                          VARCHAR(255) PRIMARY KEY,
    chain_id                    INT,
    slug                        VARCHAR(255),
    created_at                  DATETIME(3),
    updated_at                  DATETIME(3),
    `name`                      VARCHAR(50),
    image                       VARCHAR(255),
    banner                      VARCHAR(255),
    discord_url                 VARCHAR(255),
    external_url                VARCHAR(50),
    twitter_username            VARCHAR(50),
    opensea_verification_status VARCHAR(20),
    `description`               VARCHAR(1000),
    token_count                 VARCHAR(10),
    on_sale_count               VARCHAR(10),
    primary_contract            VARCHAR(255),
    token_set_id                VARCHAR(255),
    creator                     VARCHAR(255),
    royalties                   VARCHAR(500),
    all_royalties               VARCHAR(1000),
    floor_ask                   VARCHAR(1000),
    top_bid                     VARCHAR(1000),
    `rank`                      VARCHAR(255),
    volume                      VARCHAR(255),
    volume_change               VARCHAR(255),
    floor_sale                  VARCHAR(255),
    floor_sale_change           VARCHAR(255),
    collection_bid_supported    BOOLEAN,
    owner_count                 INT,
    contract_kind               VARCHAR(15),
    minted_timestamp            VARCHAR(20)
);

insert into tb_collections (id, chain_id, slug, created_at, updated_at, `name`, image, banner, discord_url, external_url,
                            twitter_username, opensea_verification_status, description, token_count, on_sale_count,
                            primary_contract, token_set_id, creator, royalties, all_royalties, floor_ask, top_bid,
                            `rank`, volume, volume_change, floor_sale, floor_sale_change, collection_bid_supported,
                            owner_count, contract_kind, minted_timestamp)
    value (
'0xa7d8d9ef8d8ce8992df33d8b8cf4aebabd5bd270:0:999999', 1, 'art-blocks',
STR_TO_DATE(REPLACE(REPLACE('2023-06-02T23:43:00.360Z', 'T', ' '), 'Z', ''),'%Y-%m-%d %H:%i:%s.%f'),
STR_TO_DATE(REPLACE(REPLACE('2023-07-13T20:24:25.538Z', 'T', ' '), 'Z', ''),'%Y-%m-%d %H:%i:%s.%f'),
'Art Blocks', 'https://i.seadn.io/gcs/files/fd5e8fa6bb4e39cddcdb4c9a0b685c5e.png?w=500&auto=format',
'https://i.seadn.io/gcs/files/6a0193895d5538c3e04da84ec9ec4f76.jpg?w=500&auto=format',
'https://discord.gg/artblocks', 'https://artblocks.io', 'artblocks_io', 'verified',
'Art Blocks is dedicated to bringing compelling works of contemporary generative art to life. We unite artists, collectors, and blockchain technology in service of groundbreaking artwork and remarkable experiences.',
'0', '0', '0xa7d8d9ef8d8ce8992df33d8b8cf4aebabd5bd270', 'range:0xa7d8d9ef8d8ce8992df33d8b8cf4aebabd5bd270:0:999999',
null,
'{
    "recipient": null,
    "breakdown": [],
    "bps": 0
}', '{}',
'{
    "id": null,
    "price": null,
    "maker": null,
    "validFrom": 2147483647,
    "validUntil": null,
    "token": null
  }',
'{
    "id": null,
    "sourceDomain": null,
    "price": null,
    "maker": null,
    "validFrom": null,
    "validUntil": null
  }',
'{
    "1day": null,
    "7day": null,
    "30day": null,
    "allTime": null
  }',
'{
    "1day": 0,
    "7day": 0,
    "30day": 0,
    "allTime": 0
  }',
'{
    "1day": null,
    "7day": null,
    "30day": null
  }',
'{
    "1day": null,
    "7day": null,
    "30day": null
  }',
'{
    "1day": null,
    "7day": null,
    "30day": null
  }',
true, 0, 'erc721', null
);