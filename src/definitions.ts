// declare module '@capacitor/core' {
//   interface PluginRegistry {
//     dsiemvandroid: dsiemvandroidPlugin;
//     dsiEMVAndroidinstance: dsiEMVAndroidinstancePlugin;
//   }
// }

export interface dsiemvandroidPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}


export interface dsiEMVAndroidinstancePlugin {
  getInstance(): Promise<any> ;
}


