import { WebPlugin } from "@capacitor/core";
import { DSIEMVPlugin } from './definitions';

export class DSEMVWeb extends WebPlugin implements DSIEMVPlugin {
  constructor() {
    super({
      name: 'DSIEMV',
      platforms: ['web'],
    });
  }

  async echo(call: { value: string }): Promise<{ value: string }> 
  {
    //  const option =  new Promise<options>();
    //  return  option
    call.value = call.value +  " - output is from web implementation"
    return call  
    //  throw this.unimplemented("I'm Not implemented on web.");
  }

  getInstance(): Promise<{ value: string }>
   {
    throw this.unimplemented("DSI - getInstance - not implemented on web.");
  }

  foundation(): Promise<{ value: string }>
   {
    throw this.unimplemented("Foundation not implemented on web.");
  }
  //add each exported definition here with not implemented for web
}

const DSIEMV = new DSEMVWeb();
export { DSIEMV };
