import { Plugin } from './plugin.model';

export class Flow {
  entityName: string;
  flowName: string;
  pluginFormat: string;
  dataFormat: string;
  plugins: Array<Plugin>;
  tabIndex = 0;

  constructor() {}

  fromJSON(json) {
    this.entityName = json.entityName;
    this.flowName = json.flowName;
    this.pluginFormat = json.pluginFormat;
    this.dataFormat = json.dataFormat;
    this.plugins = [];
    if (json.plugins) {
      for (let plugin of json.plugins) {
        this.plugins.push(new Plugin().fromJSON(plugin));
      }
    }
    return this;
  }

}
