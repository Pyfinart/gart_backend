import {
    ProjectCurrency,
    ProjectAmount,
    ProjectFloorAskPrice,
    ProjectCollection,
} from "../model/Models";

function loadProjectData(jsonData) {
    try {
        const obj = JSON.parse(jsonData);
        if (!obj.data || !Array.isArray(obj.data)) {
            throw new Error("Invalid data structure");
        }
        const collections = obj.collections.map(
            (collection) =>
                new ProjectCollection(
                    collection.collectionId,
                    collection.name,
                    collection.slug,
                    collection.contract,
                    collection.image,
                    collection.allTimeVolume,
                    new ProjectFloorAskPrice(
                        new ProjectCurrency(
                            collection.floorAskPrice.currency.contract,
                            collection.floorAskPrice.currency.name,
                            collection.floorAskPrice.currency.symbol,
                            collection.floorAskPrice.currency.decimals
                        ),
                        new ProjectAmount(
                            collection.floorAskPrice.amount.raw,
                            collection.floorAskPrice.amount.decimal,
                            collection.floorAskPrice.amount.usd,
                            collection.floorAskPrice.amount.native
                        )
                    ),
                    collection.openseaVerificationStatus
                )
        );
        return collections;
    } catch (e) {
        console.error(
            "Failed to parse JSON, create people, or invalid data structure",
            e
        );
        return null;
    }
}

const fs = require("fs");

function loadJsonFile(filePath) {
    try {
        const jsonData = fs.readFileSync(filePath, "utf8");
        return JSON.parse(jsonData);
    } catch (e) {
        console.error("Failed to read file or parse JSON", e);
        return null;
    }
}

const projectFilePath = "../data/collectionOnArtBlocks/projectData.json";
const projectData = loadJsonFile(projectFilePath);
if (projectData) {
    // 这里的到的是project页面的数据
    const projectCollections = loadProjectData(JSON.stringify(projectData));
    console.log(projectCollections);
}

const marketFilePath = "../data/marketplaceCollectionData/data/marketplaceCollectionData/marketplaceArtBlocks.json";
const marketData = loadJsonFile(marketFilePath);
if (marketData) {
  // 这里的到的是marketplace页面的数据
  const makertCollections = loadProjectData(JSON.stringify(marketData));
  console.log(makertCollections);
}