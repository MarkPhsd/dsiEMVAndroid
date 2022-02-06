// https://capacitorjs.com/docs/updating/plugins/3-0
// https://stackoverflow.com/questions/58047430/ionic-capacitor-plugin-not-working-for-android
// https://capacitorjs.com/docs/v3/plugins/method-types
// https://ionicframework.com/blog/understanding-changes-to-capacitor-3-core-plugins/
// https://capacitorjs.com/docs/android/custom-code

// https://capacitorjs.com/docs/plugins/android

import { registerPlugin } from "@capacitor/core";
import { DSIEMVPlugin } from "./definitions";

const DSIEMV = registerPlugin<DSIEMVPlugin>("DSIEMV", {
  web: () => import("./web").then((m) => new m.DSEMVWeb()),
});

export * from "./definitions";
export { DSIEMV };

// example:
// import { registerPlugin } from "@capacitor/core";
// import { NativeMarketPlugin } from "./definitions";

// const NativeMarket = registerPlugin<NativeMarketPlugin>("NativeMarket", {
//   web: () => import("./web").then((m) => new m.NativeMarketWeb()),
// });

// // export * from './web'; // @todo
// export * from "./definitions";
// export { NativeMarket };