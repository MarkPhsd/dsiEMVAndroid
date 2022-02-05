// https://capacitorjs.com/docs/updating/plugins/3-0
// https://stackoverflow.com/questions/58047430/ionic-capacitor-plugin-not-working-for-android
// https://capacitorjs.com/docs/v3/plugins/method-types
// https://ionicframework.com/blog/understanding-changes-to-capacitor-3-core-plugins/
// https://capacitorjs.com/docs/android/custom-code

// https://capacitorjs.com/docs/plugins/android

export * from './definitions';
export * from './web';

// import      { registerPlugin } from '@capacitor/core';
// import type { dsiemvandroidPlugin } from './definitions';

// const dsiEMVEchoPlugin = registerPlugin<dsiemvandroidPlugin>('dsiEMVEchoPlugin', {
//   web: () => import('./web').then(m => new m.dsiemvandroidWeb()),
//   //provided example         electron: () => ("./electron").then(m => new m.MyCoolPluginElectron())
//   //test atempt didn't work  android: () => import('./definitions').then(m => new m.dsiemvandroidPlugin()),
// });



// export * from './definitions';
// export { dsiEMVEchoPlugin };

// export interface EchoPlugin {
//   echo(options: { value: string }): Promise<{ value: string }>;
// }

// // -const Echo = registerPlugin('Echo');
// const Echo = registerPlugin<EchoPlugin>('Echo');

// export default Echo;