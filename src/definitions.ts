// declare module '@capacitor/core' {
//   interface PluginRegistry {
//     dsiemvandroidPlugin  : dsiemvandroidPlugin;
//     dsiEMVAndroidInstance: dsiEMVAndroidinstancePlugin;
//   }
// }

export interface dsiemvandroidPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}

export interface dsiEMVAndroidinstancePlugin {
  getInstance(): Promise<any> ;
}

export interface EchoPlugin {
  echo(options: { value: string }): Promise<{ value: string }> 
  openMap(options: OpenMapOptions): Promise<void>;
}

export interface OpenMapOptions {
  latitude: number;
  longitude: number;
}