import Moralis from 'moralis';

try {
    await Moralis.start({
        apiKey: "8ICOkuhXj0J6UIhEkg8UfNjPlL1lHSEysvGiwdzwhidKzk5BEUpE8hUiGOh2wjFq"
    });

    const response = await Moralis.EvmApi.nft.getWalletNFTs({
        "chain": "0x1",
        "format": "decimal",
        "mediaItems": false,
        "address": "0xff3879b8a363aed92a6eaba8f61f1a96a9ec3c1e"
    });

    console.log(response.raw);
} catch (e) {
    console.error(e);
}