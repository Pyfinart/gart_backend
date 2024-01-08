CREATE TABLE tb_offer_prices (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    currency_contract VARCHAR(255),
    currency_name VARCHAR(50),
    currency_symbol VARCHAR(10),
    currency_decimals INT,
    amount_raw VARCHAR(255),
    amount_decimal DECIMAL(18, 6),
    amount_usd DECIMAL(18, 2),
    amount_native DECIMAL(18, 6),
    netAmount_raw VARCHAR(255),
    netAmount_decimal DECIMAL(18, 6),
    netAmount_usd DECIMAL(18, 2),
    netAmount_native DECIMAL(18, 6)
);

CREATE TABLE tb_offer_criteria (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    kind VARCHAR(50),
    collection_id VARCHAR(255)
);

CREATE TABLE tb_offer_sources (
    id VARCHAR(255) PRIMARY KEY,
    domain VARCHAR(255),
    name VARCHAR(100),
    icon VARCHAR(255),
    url TEXT
);

CREATE TABLE tb_offer_fee_breakdown (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    transaction_id VARCHAR(255),
    bps INT,
    kind VARCHAR(50),
    recipient VARCHAR(255)
);

CREATE TABLE tb_offers (
    id VARCHAR(255) PRIMARY KEY,
    kind VARCHAR(50),
    side VARCHAR(10),
    status VARCHAR(20),
    tokenSetId VARCHAR(255),
    tokenSetSchemaHash VARCHAR(255),
    contract VARCHAR(255),
    contractKind VARCHAR(20),
    maker VARCHAR(255),
    taker VARCHAR(255),
    price_id BIGINT,
    validFrom BIGINT,
    validUntil BIGINT,
    quantityFilled INT,
    quantityRemaining INT,
    criteria_id BIGINT,
    source_id BIGINT,
    feeBps INT,
    expiration BIGINT,
    isReservoir BOOLEAN,
    createdAt DATETIME,
    updatedAt DATETIME,
    originatedAt DATETIME
);

