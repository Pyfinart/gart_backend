CREATE TABLE tb_activity (
     id BIGINT AUTO_INCREMENT PRIMARY KEY,
     type VARCHAR(10),
     from_address VARCHAR(255),
     to_address VARCHAR(255),
     price VARCHAR(500),
     amount INT,
     `timestamp` VARCHAR(20),
     created_at DATETIME(3),
     contract VARCHAR(255),
     token_id VARCHAR(10),
     token_name VARCHAR(30),
     token_image VARCHAR(255),
     collection_id VARCHAR(255),
     collection_name VARCHAR(30),
     collection_image VARCHAR(255),
     order_id VARCHAR(255),
     order_side VARCHAR(10),
     order_source VARCHAR(255),
     order_criteria VARCHAR(500)
);

insert into tb_activity (type, from_address, to_address, price, amount, timestamp, created_at, contract, token_id, token_name, token_image, collection_id, collection_name, collection_image, order_id, order_side, order_source, order_criteria)
    value
    ('bid', '0x107b34007aea13eed48cbdbb0d0a9888575126bc', null,
'{
    "currency": {
      "contract": "0xc02aaa39b223fe8d0a0e5c4f27ead9083c756cc2",
      "name": "Wrapped Ether",
      "symbol": "WETH",
      "decimals": 18
    },
    "amount": {
      "raw": "136600000000000000",
      "decimal": 0.1366,
      "usd": 279.42032,
      "native": 0.1366
    }
}',
1, '1699861358',
STR_TO_DATE(REPLACE(REPLACE('2023-11-13T07:42:38.456Z', 'T', ' '), 'Z', ''),'%Y-%m-%d %H:%i:%s.%f'),
'0xc92ceddfb8dd984a89fb494c376f9a48b999aafc', '8333', 'Creature #8333', 'https://i.seadn.io/gcs/files/d04476cf0bf54fa969352a4e92c0ed86.jpg?w=500&auto=format',
'0xc92ceddfb8dd984a89fb494c376f9a48b999aafc', 'Creature World', 'https://i.seadn.io/gae/PkMdNUr4UsEq5RLvAm721Ja5QGAijunAVDMz0hfRuyHQn853TRQzKL4aTFBgWPoy-nWlYA3hXzAm7flCmKn7Z9p2HN0GJxAtAixB4g?w=500&auto=format',
'0x92cca1852664fb94eaa2fa3489ad5740ec812ad399e2c9ae05ba7e56c7e1f141', 'bid',
'{
  "domain": "opensea.io",
  "name": "OpenSea",
  "icon": "https://raw.githubusercontent.com/reservoirprotocol/indexer/v5/src/models/sources/opensea-logo.svg"
}',
'{
  "kind": "token",
  "data": {
    "collection": {
      "id": "0xc92ceddfb8dd984a89fb494c376f9a48b999aafc",
      "name": "Creature World",
      "image": "https://i.seadn.io/gae/PkMdNUr4UsEq5RLvAm721Ja5QGAijunAVDMz0hfRuyHQn853TRQzKL4aTFBgWPoy-nWlYA3hXzAm7flCmKn7Z9p2HN0GJxAtAixB4g?w=500&auto=format"
    },
    "token": {
      "tokenId": "8333",
      "name": null,
      "image": null
    }
  }
}');
