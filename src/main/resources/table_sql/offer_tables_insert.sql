insert into tb_offers (
    id, kind, side, status, tokenSetId, tokenSetSchemaHash, contract, contractKind, maker, taker, price_id, validFrom, validUntil, quantityFilled, quantityRemaining, criteria_id, source_id, feeBps, expiration, isReservoir, createdAt, updatedAt, originatedAt
) values
    ('0xc635bb5ad0b97f4aae45d8bbbbc1d457e35ced8411cd90df2dc490b15b3d40a3',
     'seaport-v1.5', 'buy', 'active',
     'dynamic:collection-non-flagged:0xc92ceddfb8dd984a89fb494c376f9a48b999aafc',
     '0x0852a58469d64e4c3f7fcaa176e5b1c948b19456b0cf8969f9319574134e14c4',
     '0xc92ceddfb8dd984a89fb494c376f9a48b999aafc', 'erc721', '0x2ff895e051f7a1c29c2d3bdab35c4960e3e1ec72',
     '0x0000000000000000000000000000000000000000',
     1,
     1699862331, 1699862931, 0, 1,
     1,
     '0x5b3256965e7c3cf26e11fcaf296dfc8807c01073',
     250, 1699862931, null,
     STR_TO_DATE(REPLACE(REPLACE('2023-11-13T07:58:53.516Z', 'T', ' '), 'Z', ''),'%Y-%m-%d %H:%i:%s.%f'),
     STR_TO_DATE(REPLACE(REPLACE('2023-11-13T07:58:53.516Z', 'T', ' '), 'Z', ''),'%Y-%m-%d %H:%i:%s.%f'),
     STR_TO_DATE(REPLACE(REPLACE('2023-11-13T07:58:51.564Z', 'T', ' '), 'Z', ''),'%Y-%m-%d %H:%i:%s.%f')
    );

insert into tb_offer_fee_breakdown (transaction_id, bps, kind, recipient)
VALUES ('0xc635bb5ad0b97f4aae45d8bbbbc1d457e35ced8411cd90df2dc490b15b3d40a3', 250, 'marketplace',
        '0x0000a26b00c1f0df003000390027140000faa719');

insert into tb_offer_sources (id, domain, name, icon, url) value
    ('0x5b3256965e7c3cf26e11fcaf296dfc8807c01073', 'opensea.io', 'OpenSea',
'https://raw.githubusercontent.com/reservoirprotocol/indexer/v5/src/models/sources/opensea-logo.svg',
'https://opensea.io/assets/ethereum/0x2d0ee46b804f415be4dc8aa1040834f5125ebd2e/${tokenId}');

insert into tb_offer_criteria (kind, collection_id) VALUE
    ('collection', '0xc92ceddfb8dd984a89fb494c376f9a48b999aafc');

insert into tb_offer_prices (currency_contract, currency_name, currency_symbol, currency_decimals, amount_raw, amount_decimal, amount_usd, amount_native, netAmount_raw, netAmount_decimal, netAmount_usd, netAmount_native)
    value
    ('0xc02aaa39b223fe8d0a0e5c4f27ead9083c756cc2', 'Wrapped Ether', 'WETH', 18, '63200000000000000', 0.0632, 126.04598,
0.0632, '61620000000000000', 0.06162, 126.04598, 0.06162);

alter table tb_offer_fee_breakdown
    add column id bigint;

alter table tb_offer_fee_breakdown
    add primary key (id);

delete
from tb_offers
where id = '0xc635bb5ad0b97f4aae45d8bbbbc1d457e35ced8411cd90df2dc490b15b3d40a3';

alter table tb_offers
modify column source_id varchar(255);