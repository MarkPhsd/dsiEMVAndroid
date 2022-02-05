import { WebPlugin } from '@capacitor/core';
import { dsiemvandroidPlugin } from './definitions';
import { registerWebPlugin } from '@capacitor/core';

// import type {
//   EchoPlugin, OpenMapOptions
// } from './definitions';

export class dsiemvandroidWeb extends WebPlugin implements dsiemvandroidPlugin {
  constructor() {
    super({
      name: 'dsiemvandroid',
      platforms: ['web'],
    });
  }

  async echo(options: { value: string }): Promise<{ value: string }> {
    options.value = options.value +  " output is from web implementation"
    return options;
  }
}

const dsiemvandroid = new dsiemvandroidWeb();

export { dsiemvandroid };

registerWebPlugin(dsiemvandroid);

////////////////////////
// export class EchoWeb extends WebPlugin implements EchoPlugin {
//   openMap(options: OpenMapOptions): Promise<void> {
//     console.log(options)
//     throw new Error('Method not implemented.');
//   }
//   // other methods
//   async echo(options: { value: string }): Promise<{ value: string }> {
//     options.value = options.value +  " output is from web implementation"
//     return options;
//   }
//   // async openMap(location: OpenMapOptions): Promise<void> {
//     // logic here
// }