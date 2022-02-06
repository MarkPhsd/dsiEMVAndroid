
// import type { PluginListenerHandle } from '@capacitor/core';

export interface DSIEMVPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  getInstance(): Promise<any> ;
  foundation(): Promise<any>;
  //additional methods from java classes
}
